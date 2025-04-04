#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node* left;
    Node* right;

    Node(int val) : data(val), left(nullptr), right(nullptr) {}
};

class Solution {
public:
    int maxDepth(Node* root) {
        if (root == nullptr) {
            return 0;
        }

        int lh = maxDepth(root->left);
        int rh = maxDepth(root->right);

        return 1 + max(lh, rh);
    }
};

int main() {
    Node* root = new Node(5);
    root->left = new Node(6);
    root->right = new Node(2);
    root->left->left = new Node(7);
    root->right->right = new Node(4);

    Solution solution;

    int depth = solution.maxDepth(root);

    cout << depth << endl;

    return 0;
}
