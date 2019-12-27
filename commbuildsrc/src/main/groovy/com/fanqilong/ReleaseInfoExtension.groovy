/**
 * 自定义plugin进行参数传递
 */
class ReleaseInfoExtension {
    String versionCode
    String versionName
    String versionInfo
    String fileName

    ReleaseInfoExtension() {
    }


    @Override
    String toString() {
        return "ReleaseInfoExtension{" +
                "versionCode='" + versionCode + '\'' +
                ", versionName='" + versionName + '\'' +
                ", versionInfo='" + versionInfo + '\'' +
                ", fileName='" + fileName + '\'' +
                '}'
    }
}