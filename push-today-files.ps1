# Paths
$sourceRoot = "S:\CODING\DSA"              # Your main local DSA folder where you write code in subfolders like Strings, Array, etc.
$repoRoot = "S:\CODING\DSA\DSA_Git"       # Your local cloned DSA GitHub repo root folder

# Get today's date in yyyy-MM-dd format
$today = Get-Date -Format "yyyy-MM-dd"

# Find all files modified today in the source folder and its subfolders
$files = Get-ChildItem -Path $sourceRoot -Recurse -File | Where-Object {
    $_.LastWriteTime.Date -eq (Get-Date).Date
}

if ($files.Count -eq 0) {
    Write-Host "No files modified today to push."
    exit
}

# Copy each file directly into the root of the repo (flattened, no folders)
foreach ($file in $files) {
    $destPath = Join-Path -Path $repoRoot -ChildPath $file.Name
    Copy-Item -Path $file.FullName -Destination $destPath -Force
    Write-Host "Copied $($file.Name) to repo root"
}

# Go to the repo folder
Set-Location $repoRoot

# Git commands
git fetch origin
git pull origin main

git add .

git commit -m "Auto commit of today's files on $(Get-Date -Format 'yyyy-MM-dd')"

git push origin main
