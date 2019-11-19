# create_maven_by_command

1. mvn archetype:generate
2. 1319
  groupid: com.elcho.maven
  artifactId: maven-test-springboot
  version:0.0.1-SNAPSHOT
  package: com.elcho.maven
  
3. package: jar/war

4.cd project path
  mvn compile

5.mvn package

6.jar -jar XXX.jar

7.mvn clean

8.<packaging>war</packaging>
  mvn clean package
  
9. Create manager user in tomcat by creating the config entry in tomcat-users.xml
<tomcat-users>
<role rolename="manager-gui"/>
<role rolename="manager-script"/>
<role rolename="manager-jmx"/>
<role rolename="manager- status"/>
<user username="tomcat" password="tomcat" roles="manager-gui"/>
<user username="admin" password="123456" roles="manager-script"/>
<user username="admin" password="123456" roles="manager-jmx"/>
<user username="admin" password="123456" roles="manager-status"/>
</tomcat-users>


10. POM.XML
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-tomcat</artifactId>
   <scope>provided</scope>
</dependency>

cd pom.xml path
call mvn -f pom.xml dependency:copy-dependencies

11. Add SpringBootServletInitializer 
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
public class ApplicationInitializer extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


12. Jetty
	1. 添加：

<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-jetty</artifactId>
<version>1.3.3.RELEASE</version>
</dependency>

	2. 注释：
<!--<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-tomcat</artifactId>
<scope>provided</scope>
</dependency>-->

	3. 添加exclusions
	
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
<exclusions>
<exclusion>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-tomcat</artifactId>
</exclusion>
</exclusions>
</dependency>

4. mvn spring-boot:run