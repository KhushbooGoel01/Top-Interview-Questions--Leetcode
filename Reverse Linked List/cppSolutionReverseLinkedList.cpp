// Reverse Linked List Problem Leetcode link : https://leetcode.com/problems/reverse-linked-list

/*
Reverse a singly linked list.


Example:


Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:


A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

// C++ program to reverse a linked list
#include <bits/stdc++.h>
using namespace std;

// Node class
class Node
{
public:
    int data;
    Node *next;
    Node(int data)
    {
        this->data = data;
        this->next = NULL;
    }
};

// Function to reverse a linked list
Node *reverse(Node *head)
{
    // Base case
    if (head == NULL || head->next == NULL)
        return head;

    // Recur for remaining list
    Node *p = reverse(head->next);

    // Modify head and move head to next node
    head->next->next = head;
    head->next = NULL;

    return p;
}

// Function to print a linked list
void printList(Node *head)
{
    while (head != NULL)
    {
        cout << head->data << " ";
        head = head->next;
    }
}

// Driver program
int main()
{
    Node *head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);
    head->next->next->next = new Node(4);
    head->next->next->next->next = new Node(5);

    cout << "Given linked list \n";
    printList(head);

    head = reverse(head);

    cout << "\nReversed linked list \n";
    printList(head);

    return 0;
}

// let's try to it iteratively

// C++ program to reverse a linked list
#include <bits/stdc++.h>
using namespace std;

// Node class
class Node
{
public:
    int data;
    Node *next;
    Node(int data)
    {
        this->data = data;
        this->next = NULL;
    }
};

// Function to reverse a linked list in an iterative way
Node *reverse(Node *head)
{
    // Base case
    if (head == NULL || head->next == NULL)
        return head;

    // Initialize prev, curr and next
    Node *prev = NULL;
    Node *curr = head;
    Node *next = NULL;

    // Traverse the list
    while (curr != NULL)
    {
        // Store next
        next = curr->next;

        // Reverse current node's pointer
        curr->next = prev;

        // Move pointers one position ahead.
        prev = curr;
        curr = next;
    }

    // Update head pointer
    head = prev;

    return head;
}

// Function to print a linked list
void printList(Node *head)
{
    while (head != NULL)
    {
        cout << head->data << " ";
        head = head->next;
    }
}

// Driver program
int main()
{
    Node *head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);
    head->next->next->next = new Node(4);
    head->next->next->next->next = new Node(5);

    cout << "Given linked list \n";
    printList(head);

    head = reverse(head);

    cout << "\nReversed linked list \n";
    printList(head);

    return 0;
}
