// File: MyLibrary.groovy

def call(Map params) {
    // ตรวจสอบว่ามีพารามิเตอร์ที่จำเป็นสำหรับการ Checkout โค้ดจาก Git repository
    def branch = params.branch ?: 'main' // ถ้าไม่ระบุ branch ให้ใช้ 'main' เป็นค่าเริ่มต้น
    def url = params.url
    def credentialsId = params.credentialsId

    // Checkout โค้ดจาก Git repository โดยใช้พารามิเตอร์ที่ระบุ
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    git branch: branch, credentialsId: credentialsId, url: url
                }
            }
        }
    }
}
