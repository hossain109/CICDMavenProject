# CICDMavenProject
## Install jenkins from document official

For installation follow officiel documentation according oprating system: https://www.jenkins.io/doc/book/installing/linux/
For almalinux 8 must install open-jdk -11 otherwise jenkins not work because almalinux8 compatible with jdk11.

      sudo wget -O /etc/yum.repos.d/jenkins.repo \ 
      https://pkg.jenkins.io/redhat-stable/jenkins.repo

      sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io-2023.key

      sudo dnf upgrade

###  Add required dependencies for the jenkins package
      sudo dnf install fontconfig java-11-openjdk

      sudo dnf install jenkins

      sudo systemctl daemon-reload


### Start jenkins:

    Enable: sudo systemctl enable jenkins
    Start: sudo systemctl start jenkins
    Stop: sudo systemctl start jenkins

Then by default jenkins run on 8080 port. Access jenkins on browser http://ipaddress:8080

### Unblocak jenkins by put password: cat path
### Troubleshoot:
     To see jdk version installed: sudo alternatives --config java
     To see used port: ls -lpant

## Note: Oftenly jenkins not work cause of version jdk

## Createing agent and jobs