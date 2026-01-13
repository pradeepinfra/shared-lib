def call (){
  echo "hello, world"
}

def call() {
    echo "✅ Maven Build Started..."

    sh """
        mvn -version
        mvn clean package
    """

    echo "✅ Maven Build Completed..."
}

