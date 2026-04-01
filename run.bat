@echo off
setlocal

set "ROOT=%~dp0"
set "SRC_DIR=%ROOT%inteliCalc\src"
set "BIN_DIR=%ROOT%inteliCalc\bin"

if not exist "%SRC_DIR%" (
  echo Source folder not found: %SRC_DIR%
  pause
  exit /b 1
)

if not exist "%BIN_DIR%" (
  mkdir "%BIN_DIR%"
)

echo Compiling CountBash...
pushd "%SRC_DIR%" >nul
javac -d "%BIN_DIR%" module-info.java inteliCalc\CountBash.java
if errorlevel 1 (
  popd >nul
  echo.
  echo Compilation failed.
  pause
  exit /b 1
)
popd >nul

echo Launching CountBash...
java -p "%BIN_DIR%" -m inteliCalc/inteliCalc.CountBash

endlocal
