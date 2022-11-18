#include <iostream>
using namespace std;

void heapify(int arr[], int n, int index)
{
    // let the passed root of the tree to be largest
    int largest = index;
    int left = 2 * index + 1;
    int right = 2 * index + 2;

    if (left < n && arr[left] > arr[largest])
    {
        largest = left;
    }

    if (right < n && arr[right] > arr[largest])
    {
        largest = right;
    }

    if (largest != index)
    {
        swap(arr[index], arr[largest]);
        heapify(arr, n, largest);
    }
}

void buildheap(int arr[], int n)
{
    // To get the last non leaf node index
    int startInd = (n / 2) - 1;
    for (int i = startInd; i >= 0; --i)
    {
        heapify(arr, n, i);
    }
}

// Printing the heap
void printeheap(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

// Driver Main
int main()
{
    int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
    int N = sizeof(arr) / sizeof(arr[0]);
    buildheap(arr, N);
    printeheap(arr, N);
    return 0;
}