# 执行过程
进入result文件夹，执行 java -jar back-0.0.1-SNAPSHOT.jar，在浏览器中输入127.0.0.0:8000就可以看到网站
# 编译过程
## 前端编译过程
1. 安装Node.js，vue-cli
2. 在front文件夹里执行npm install
3. 执行npm run build，编译成功的结果在dist文件夹里
## 后端编译过程
1. 安装Java，Maven，MySQL
2. 在back文件夹的src/main/java/cn/heroisuseless/back/resources/application.yml文件中，修改数据库datasource的username和password为当前MySQL数据库的账号和密码
3. 执行sql文件夹下的sql脚本
4. 将front/dist文件夹下的所有内容转移到back文件夹的src/main/java/cn/heroisuseless/back/resources/static文件夹下
5. 在back工程里运行mvn package编译springboot后端程序，在back/target文件夹下得到jar包
5. 得出jar包后执行 java -jar back-0.0.1-SNAPSHOT.jar，在浏览器中输入127.0.0.0:8000就可以看到网站