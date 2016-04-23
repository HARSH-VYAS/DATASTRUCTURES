package com.company;

import java.util.Arrays;

/**
 * Created by Harsh P Vyas on 3/28/2016.
 */


public class SearchElementWithRotation {

    int midA[];
    int Tmid[];

    public int searchEle(int a[], int l, int h, int s) {


        int mid = (l+h) / 2;
        if (a[mid] == s) {
            System.out.println("Its match" + mid);
        }

        if (a[l] <= a[mid]) {
            if (s >= a[l] && s <= a[mid])
                return searchEle(a, l, mid - 1, s);

          //  return searchEle(a, mid + 1, h, s);
        }

        if (s >= a[mid] && s <= a[h])
            return searchEle(a, mid+1, h, s);

        return searchEle(a, l, mid-1, s);

    }
}
