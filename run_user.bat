title "%~f0"
java -Xms200m -Xmx200m -XX:MetaspaceSize=200m -XX:MaxMetaspaceSize=200m -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=9996,server=y,suspend=n -Dfile.encoding=UTF8 -jar loan-user/target/loan-user.jar