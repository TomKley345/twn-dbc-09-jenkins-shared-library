#!/user/bin/env groovy

import com.example.Docker
def call(String imageName) {
    echo "preparing docker push in dockerPush.groovy ..."
    return new Docker(this).dockerPush(imageName)
}