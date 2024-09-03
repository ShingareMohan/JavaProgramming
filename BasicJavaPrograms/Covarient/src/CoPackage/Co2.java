package CoPackage;

class user{
    user login(){
        System.out.println("Login in user");
    return this;
    }
}

class client extends user{
    client login(){
        System.out.println("Login in client");
    return this;
    }
}
