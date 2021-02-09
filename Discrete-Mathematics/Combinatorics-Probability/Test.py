def count_wins(dice1, dice2):
    assert len(dice1) == 6 and len(dice2) == 6
    dice1_wins, dice2_wins = 0, 0

    for i in dice1:
        for j in dice2:
            if(i > j):
                dice1_wins += 1
            elif(j > i):
                dice2_wins += 1
    return (dice1_wins, dice2_wins)

def find_the_best_dice(dices):
    assert all(len(dice) == 6 for dice in dices)
    total_wins = [0] * len(dices);
    for i in range(len(dices)-1):
        for j in range(i+1,len(dices)):
            wins = count_wins(dices[i],dices[j])
            if(wins[0] > wins[1]):
                total_wins[i] += 1
            elif(wins[1] > wins[0]):
                total_wins[j] += 1

    if(max(total_wins) == len(dices)-1):
        return total_wins.index(max(total_wins))
    return -1

def compute_strategy(dices):
    assert all(len(dice) == 6 for dice in dices)

    strategy = dict()
    strategy["choose_first"] = True

    if find_the_best_dice(dices) != -1:
        strategy["first_dice"] = find_the_best_dice(dices)
    else:
        strategy["choose_first"] = False
        
        for i in range(len(dices)):
            strategy[i] = (i+1) % len(dices)
        
        for i in range(len(dices)):
            best = i
            for j in range(len(dices)):
                if j != i:
                    wins = count_wins(dices[i],dices[j])
                    if wins[1] > wins[0]:
                        best = j
            strategy[i] = best
    return strategy







