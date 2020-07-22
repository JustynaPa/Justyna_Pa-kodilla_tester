del /S build\libs\*.jar

gradlew build

if exist build\libs\*.jar (
    for /R build\libs %%f in (*.jar) do copy %%f C:\rungradlew.bat
) else (
    echo "Error, not found file"
)