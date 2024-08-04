#include<stdio.h>
#include<conio.h>
#define Max 30
void main(){
    int n, bt[Max],wt[Max],tat[Max];
    float awt=0,atat=0;
    printf("enter the number of processes:");
    scanf("%d",&n);
printf("Enter burst time of each process:");
for (int i = 0; i < n; i++)
{
    scanf("%d",&bt[i]);
}
printf("proceess\t burst time\t waiting time\t turn around time\n");

for (int i = 0; i < n; i++){
wt[i]=0;
    tat[i]=0;    
    for(int j=0; j<i; j++){
        wt[i]=wt[i]+bt[j];
    }
    tat[i]=wt[i]+bt[i];
    awt=awt+wt[i];
    atat=atat+tat[i];
    printf("%d\t %d\t %d\t %d\t",i+1,bt[i],wt[i],tat[i]);
}
awt=awt/n;
atat=atat/n;
printf("Average waiting time %d, Average turn around time %d" , awt,atat);
}