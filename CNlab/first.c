#include<stdio.h>
#include<stdlib.h>
void main(){
    int arr[10]={};
    int target =6;
    int size = sizeof(arr) / sizeof(arr[0]);
    
    printf("Enter 10 numbers as user input\n");
    for(int z=0; z<size; z++){
        scanf("%d",&arr[z]);
    }
    for (int i = 0; i < size; i++)
    {
        for (int j = i+1; j < size; j++)
        {
            
            
            if (target==arr[i]+arr[j])
            {
                printf("required indices are %d,%d \n",i,j);
                }
            
        }
        }
    

}