import clients.HiveClient
import models.Patient


import scala.io.StdIn.readLine

object Driver {

    def main(args: Array[String]): Unit = {

        HiveClient.Connect()





        HiveClient.Close()





    }
}
