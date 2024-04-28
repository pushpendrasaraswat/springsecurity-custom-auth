## Spring security using own tables and Authentication


Code is using spotless integration also.

**custom auth is used for  Spring security**

SpringSecurityUserDetails class is implementing UserDetailsService and overriding 
loadUserByUsername() method to provide the details fo the users.

database is postgresql which is used as docker image.

database connection is mentioned in application.yaml file




