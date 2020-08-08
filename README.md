# avaj-launcher

## Compile
```
find * -name "*.java" > sources.txt
javac -sourcepath @sources.txt
```
## Clean Up
```
rm -rf $(find * -name "*.class") out
```