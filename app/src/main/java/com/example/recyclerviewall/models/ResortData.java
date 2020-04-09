package com.example.recyclerviewall.models;

import java.util.ArrayList;

public class ResortData {

    public static String[][] data = new String[][]{

            {
                "মিনি কক্সবাজার, চাঁদপুর",
                    "চাঁদপুর ত্রিনদী মোহনা বড়স্টেশন মোলহেড থেকে দেড় কিলোমিটার দূরে পদ্মা ও মেঘনার মিলনস্থলে",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Mini_Cox%27s_Bazar_Chandpur.jpg/1024px-Mini_Cox%27s_Bazar_Chandpur.jpg",
                    "মিনি কক্সবাজার বাংলাদেশের চাঁদপুর জেলায় পদ্মা, মেঘনা ও ডাকাতিয়া নদীর মিলনস্থলে অবস্থিত একটি পর্যটন কেন্দ্র। এটি নদীকেন্দ্রীক বাংলাদেশের সর্বোচ্চ পর্যটন কেন্দ্র। এর চারদিকে নদী হওয়ায় কক্সবাজার সমুদ্র সৈকতের মতো দেখায় তাই পর্যটকরা এর নাম দিয়েছে মিনি কক্সবাজার। স্থানীয়ভাবে বালু চর, পদ্মার চর ও মেঘনার চর নামেও এর পরিচিতি রয়েছে। বেসরকারিভাবে ‘স্বপ্ন ট্যুরিজম’ এ পর্যটন কেন্দ্রটি পরিচালনা করে।",
                    "চাঁদপুর, বাংলাদেশ"
            },
            {
                "Tea production in Bangladesh",
                    "It covers an overall are of 450 sq. km.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Sreemangal_tea_garden_2017-08-20.jpg/346px-Sreemangal_tea_garden_2017-08-20.jpg",
                    "Sylhet is the place where tea and tea gardens are available from where Sylhet has been contributing for improving economic growth of Bangladesh. Bangladesh is also earning foreign money by exporting tea to the abroad.",
                    "Shaymoli Paribahan:"
            },
            {
                "Jaflong",
                    " It is about 60 km from Sylhet town",
                    "https://media-cdn.tripadvisor.com/media/photo-f/10/fd/37/e9/bisnakandi.jpg",
                    "Jaflong (Bengali: জাফলং) is a hill station and tourist destination in the Division of Sylhet, Bangladesh. It is located in Gowainghat Upazila of Sylhet District and situated at the border between Bangladesh and the Indian state of Meghalaya.",
                    "Jaflong is a tourist spot in Sylhet division."
            },
            {
                    "Cox's Bazar Beach",
                    "Length of 155 km (96 mi)",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Cox%27s_Bazar_boats.jpg/250px-Cox%27s_Bazar_boats.jpg",
                    "Cox's Bazar is a District under Chittagong Division, which is famous for its longest unbroken sandy sea beach. It is located 150 km south of the industrial port- Chittagong. Cox's Bazar is considered as having the longest sea beach in the world, with a total of 121 kilometer long.",
                    "Cox's Bazar is a District under Chittagong Division"
            },
            {
                    "Tea production in Bangladesh",
                    "It covers an overall are of 450 sq. km.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Sreemangal_tea_garden_2017-08-20.jpg/346px-Sreemangal_tea_garden_2017-08-20.jpg",
                    "Sylhet is the place where tea and tea gardens are available from where Sylhet has been contributing for improving economic growth of Bangladesh. Bangladesh is also earning foreign money by exporting tea to the abroad.",
                    "Shaymoli Paribahan:"
            },
            {
                    "Jaflong",
                    " It is about 60 km from Sylhet town",
                    "https://media-cdn.tripadvisor.com/media/photo-f/10/fd/37/e9/bisnakandi.jpg",
                    "Jaflong (Bengali: জাফলং) is a hill station and tourist destination in the Division of Sylhet, Bangladesh. It is located in Gowainghat Upazila of Sylhet District and situated at the border between Bangladesh and the Indian state of Meghalaya.",
                    "Jaflong is a tourist spot in Sylhet division."
            }
    };
    public static ArrayList<Resort> getListData(){
        Resort resort;
        ArrayList<Resort> list = new ArrayList<>();

        for (String[] rData : data){
            resort = new Resort();
            resort.setName(rData[0]);
            resort.setElevation(rData[1]);
            resort.setPhoto(rData[2]);
            resort.setDescription(rData[3]);
            resort.setLocation(rData[4]);

            list.add(resort);
        }
        return list;
    }
}
