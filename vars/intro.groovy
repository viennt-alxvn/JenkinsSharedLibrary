def call(String name = 'human') {
  echo "Hello, ${name}."
}

def welcome(String name = 'human') {
  echo "Welcome  ${name}!"

}

def info(String name = 'human') {
    def per = new utils.DemoClass()
    per.name = name
    per.age = 21
    echo "Info: Name: ${per.name} - Age: ${per.age}"
}