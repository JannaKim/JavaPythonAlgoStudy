def game_start():
    print("[알림] 새로운 게임을 시작합니다.")

def game_over():
    print("Player : gg")
    print("[Player] 님이 게임에서 퇴장하셨습니다.")

class Unit:
    def __init__(self, name, hp, damage):
        self.name = name
        self.hp = hp
        self.damage = damage
        print(f"{name} (체력: {self.hp}, 데미지: {self.damage}) 유닛이 생성되었습니다.")
    
    def attack(self, target):
        target.hp -= self.damage
        print(f"{self.name} : {target.name} 유닛을 공격력 {self.damage} 만큼 공격합니다.")

    def damaged(self, damage):
        print(f"{self.name} : {damage} 만큼 데미지를 입었습니다.")
        if self.hp <= 0:
            print(f"{self.name} : 유닛이 파괴되었습니다.")
        else:
            print(f"{self.name} : 현재 체력은 {self.hp}입니다.")
        
class NoDamageUnit(Unit):
    def __init__(self, name, hp):
        Unit.__init__(self, name, hp, 0)
        print(f"{name}(hp: {self.hp}, damage: {self.damage})이 생성되었습니다.")

game_start()
marine = Unit("Marine", 40, 6)
medic = NoDamageUnit("Medic", 60)
firebat = Unit("Firebat", 60, 16)

firebat.attack(marine)
marine.damaged(firebat.damage)

tank = Unit("Tank", 240, 50)
tank.attack(marine)
marine.damaged(tank.damage)
game_over()
