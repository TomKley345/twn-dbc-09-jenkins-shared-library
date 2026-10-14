#!/user/bin/env groovy

def call() {
    // Remove old packages so that we can use a wildcard in Docker
    sh 'mvn clean package'

    // Build new package
    echo "building the application for branch $BRANCH_NAME"
    sh 'mvn package'
}