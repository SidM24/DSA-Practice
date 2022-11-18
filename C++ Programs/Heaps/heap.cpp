#include <iostream>
using namespace std;

// Following function is to create the max heap
// for min heap find the smallest index and then swap

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

// Heap Sort
void heapsort(int arr[], int n)
{
    // First conver the given array to max-heap
    buildheap(arr, n);
    // Swapping the root with the last and deleting the last element
    for (int i = n - 1; i >= 0; --i)
    {
        swap(arr[0], arr[i]);
        // heapify the root again
        // Size of heap keeps on decreasing therefore size=i
        heapify(arr, i, 0);
    }
}

// Driver Main
int main()
{
    int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
    int N = sizeof(arr) / sizeof(arr[0]);
    // buildheap(arr, N);
    heapsort(arr,N);
    printeheap(arr, N);
    return 0;
}