import java.io.IOException;

/**
 * Created by bar.yehudai on 5/30/2016.
 */
public class Main {
    public static void main(String args[]){
        String Qs[][] = {
                {
                        "what are the different id methods? what is the difference between them?",
                        "what is the difference between an instrumented and non-instrumented application?",
                        "what are the prerequisite for iOS full control?",
                        "what do i do to open a reflection with a fresh android device? how about iOS?",
                        "what aspects of the network can you control using NV?",
                        "How can parallel execution work?",
                        "what do you need before you can run Jenkins?",
                        "what types of mobile apps are there?",
                        "what are the pros and the cons of instrumentation?",
                        "how do you debug a slow reflection on the cloud?",
                        "how do i setup a eclipse / Java / JUnit environment for a SeeTest test?",
                        "what can cause a device open fail on the cloud?",
                        "how do i find the log files for SeeTestManual on Windows? how about MAC?"
                },
                {
                        "can I use a method my developers put in the app directly thru SeeTest? how?",
                        "XCUIRunner is running on my machine, how should I use Mayfly in this case?",
                        "what type of provision profile is used to sign EriBank? is it different in EriBankO?",
                        "at which point does instrumentation happen in Android? and at which point does it happen in iOS?",
                        "I have a brand new iPhone, how do I open it in full control?",
                        "where does SeeTest save the Paltiel app on Windows? and where on MAC?",
                        "what permissions do I need in order to instrument an Android app? why?",
                        "what native process does SeeTest use to get non-instrumented dumps in Android?",
                        "what is a custom WebView in Android programing? is it native?",
                        "An android device is connected to the computer, but SeeTest cant see it, what can it be? how can I check?",
                        "I have a provision profile for my device, should I instrument my app?",
                        "what are the three provision profile flavors? what is the difference between them?",
                        "I am testing an app with lots of UI elements in full control mode, but when I click the object spy the device goes to its springboard, why?",
                        "Where on the MAC does Seetest look for the provision profiles? how do I delete them?"
                },
                {
                        "what language is the Cloud DB written in? where are the DB files?",
                        "what are the steps to add Clean-Up to a project?",
                        "I try to open an iOS device on the cloud, but I do not have a provision profile, what will happen?",
                        "my android device is in ready state on the cloud, and opens locally just fine, but when I try to open it on the cloud I get a \"Connection Error\", what could be the problem?",
                        "I have a cloud with two agents and I \"Collect Support Data\", what will I get?",
                        "what are the constraints on the password? how do I reset the admin password?",
                        "what is the default port for the Server? what is the default port for the Agent? what is it when using ssl?",
                        "what are the optional fields when adding an agent?",
                        "I just changed the default reservation time on the cloud, what should I do to make it work?",
                        "how do I have my locally configured proxy work with cloud devices?",
                        "I just connected an Android device and an iOS device to my agent, the iOS screen immediately turned black but the Android screen did not, why?"
                },
                {
                        "what are the parameters when creating a network profile for NV?",
                        "what additional hardware do I need in order to use NV?",
                        "which SeeTest license with which features would you need to run NV?",
                        "how can I cancel the profile I applied using SetNetworkCondition?",
                        "how do I configure a certain device to work with a certain NV server?",
                        "where can I see how many devices I am allowed to use with my NV?",
                        "how do I see the network traffic for a specific device?",
                        "is the NV used to test servers or apps?",
                        "how do I use NV server? how many times should I call SetNetworkCondition?"
                },
                {
                        "what features will I have if I am activating 2 license keys on the same machine, a. OCR, Automation license user, Android, Execution Agent (2 available ports) \n b. OCR, Automation license user, iOS, Execution Agent (1 available ports)",
                        "what is the Sentinel Admin Control Center? what can I see there? can I see the Sentinel Admin Control Center of a different machine?",
                        "where are the licenses stored in a Windows machine? where are they in the MAC?",
                        "how do I delete an old license and activate a new one without a cancelation key?",
                        "how do you create and activate a license using offline activation?",
                        "a user with a node-locked license got the error: \"Too many users are currently connected\", why? and how does he fix this?",
                        "why would I not be able to access localhost:1947?",
                        "how can an admin disconnect a user from a license for other users to access it?",
                        "what is a .id file? how do I use it?",
                        "how do I generate a .c2v on a mac?",
                        "how is the license handeling service called in windows? in mac? how do I restart each?"
                }
        };
        int numQ[] = {13, 14, 11, 9, 11};
        int pages = 5;
        int page, q;
        double now;
        while(true){
            now = Math.random();
            now *= pages - 1;
            page = (int) Math.round(now);
            now = Math.random();
            now *= numQ[page] - 1 ;
            q = (int) Math.round(now);
            int qPlusOne = q + 1;
            int pagePlusOne = page + 1;
            System.out.println("answer q " + qPlusOne + " in page " + pagePlusOne);
            System.out.println(Qs[page][q]);
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
