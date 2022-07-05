
* Jenkins Shared Library *

Developers/IaC automation guys use shared libraries to avoid writing the same code from scratch for multiple projects.

In order to implement Jenkins shared library in Jenkins CICD, following things needs to be in place. The directory structure should be like this,

Directory structure
The directory structure of a Shared Library repository is as follows:

(root)
+- src                     # Groovy source files
|   +- org
|       +- foo
|           +- Bar.groovy  # for org.foo.Bar class
+- vars
|   +- foo.groovy          # for global 'foo' variable
|   +- foo.txt             # help for 'foo' variable
+- resources               # resource files (external libraries only)
|   +- org
|       +- foo
|           +- bar.json    # static helper data for org.foo.Bar





