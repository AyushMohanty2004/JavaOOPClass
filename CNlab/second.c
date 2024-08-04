#include<stdio.h>

int bsearch(int arr[],int target){
    int l = 0;
    int r = 4;
    while (l<=r)
    {
        int mid = l + (r-l)/2;
        if (arr[mid]==target)
        {
            return mid;
        }
        else if (arr[mid]<target)
        {
            l=mid+1;
        }
        else 
        {
         r=mid-1;
        }
        
    }
    return -1;
}
int main(){

int arr[5]={1,2,3,4,5};

int target = 4;
int result = bsearch(arr,target);

if (result==-1)
{
    printf("target not found");
}
else
{
    printf("Element found at %d", result);
}


}