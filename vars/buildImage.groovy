#!/user/bin/env groovy

import com.example.Docker
def call(String imageName) {
    echo 'Hi from buildImage.groovy in /jenkins-shared-library/vars/ ...'
    return new Docker(this).buildDockerImage(imageName)
}