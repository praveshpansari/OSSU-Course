#include <iostream>
#include <vector>
using std::vector;

long long get_fibonacci_partial_sum_naive(long long from, long long to)
{
    long long sum = 0;

    long long current = 0;
    long long next = 1;

    for (long long i = 0; i <= to; ++i)
    {
        if (i >= from)
        {
            sum += current;
        }

        long long new_current = next;
        next = next + current;
        current = new_current;
    }

    return sum % 10;
}

long long get_fibonacci_huge_fast(long long n, long long m)
{
    long long prev = 0;
    long long current = 1;

    std::vector<int> periods;
    periods.push_back(0);
    periods.push_back(1);
    for (int i = 0; i < m * m; ++i)
    {

        long long temp = prev;
        prev = current;
        current = (temp + prev) % m;

        if (prev == 0 && current == 1)
        {
            periods.pop_back();
            break;
        }

        periods.push_back(current);
    }

    return periods[n % periods.size()];
}

long long get_fibonacci_partial_sum_fast(long long m, long long n)
{
    int x = get_fibonacci_huge_fast(n + 2, 10) - get_fibonacci_huge_fast(m + 1, 10);
    return (x < 0) ? 10 + x : x;
}

int main()
{
    long long from, to;
    std::cin >> from >> to;
    std::cout << get_fibonacci_partial_sum_fast(from, to) << '\n';
}
