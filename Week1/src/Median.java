import java.util.ArrayList;
import java.util.List;

public class Median {




    public static void main(String[] args) {

        int nums1[] = { -9, 3, 4, 7, 14 };
        int nums2[] = { 5, 8, 10, 20 };

        int n1 = nums1.length;
        int n2 = nums2.length;

        System.out.println(getMedian(nums1, nums2, n1, n2));

    }



    
    // 1.) Median of two sorted arrays method

    static int getMedian(int nums1[], int nums2[],
                         int n, int m) {

        // Current index of input array nums1[]
        int i = 0;

        // Current index of input array nums2[]
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;


        // Since there are (n+m) elements, if n+m is odd then the middle index is median (m+n)/2
        if ((m + n) % 2 == 1)
        {
            for(count = 0;
                count <= (n + m) / 2;
                count++)
            {
                if (i != n && j != m)
                {
                    m1 = (nums1[i] > nums2[j]) ?
                            nums2[j++] : nums1[i++];
                }
                else if (i < n)
                {
                    m1 = nums1[i++];
                }

                // for case when j<m,
                else
                {
                    m1 = nums2[j++];
                }
            }
            return m1;
        }

        // median will be average of elements at index ((m+n)/2 - 1) and (m+n)/2
        // in the array after merging num1 and num2
        else
        {
            for(count = 0;
                count <= (n + m) / 2;
                count++)
            {
                m2 = m1;
                if (i != n && j != m)
                {
                    m1 = (nums1[i] > nums2[j]) ?
                            nums2[j++] : nums1[i++];
                }
                else if (i < n)
                {
                    m1 = nums1[i++];
                }

                // for case when j<m,
                else
                {
                    m1 = nums2[j++];
                }
            }
            return (m1 + m2) / 2;
        }
    }


    }





