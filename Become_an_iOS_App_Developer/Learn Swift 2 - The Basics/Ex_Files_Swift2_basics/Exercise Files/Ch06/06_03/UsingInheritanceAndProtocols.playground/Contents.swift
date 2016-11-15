class Employee {
    var yearsWorked : Double = 0
    var hasStockOptions : Bool = false
    var currentStatus : EmployeeStatus = .Active
    
    enum EmployeeStatus {
        case Active, Vacation, LeaveOfAbsence, Temp, Retired
    }
}

protocol ExecutiveMember {
    var bonusAmount : Int {
        get
    }
    func returnFullTitle() -> String
}

class CEO : Employee, ExecutiveMember {
    override init() {
        super.init()
        hasStockOptions = true
    }
    
    var bonusAmount : Int {
        return 10000
    }
    
    func returnFullTitle() -> String {
        return "Chief Executive Officer"
    }
}

class CFO : Employee {
    override init() {
        super.init()
        hasStockOptions = true
    }
    
    var bonusAmount : Int {
        return 5000
    }
    
    func returnFullTitle() -> String {
        return "Chief Financial Officer"
    }
}

class Worker : Employee {
    
}

class TempEmployee: Employee {
    override init() {
        super.init()
        currentStatus = .Temp
    }
}


let ceo = CEO()
ceo.yearsWorked = 25
ceo.bonusAmount
ceo.returnFullTitle()
ceo.currentStatus = .LeaveOfAbsence
ceo.currentStatus

let cfo = CFO()
cfo.bonusAmount
cfo.returnFullTitle()
cfo.currentStatus

let worker = Worker()
worker.currentStatus

let temp = TempEmployee()
temp.currentStatus
//fails
//temp.returnFullTitle()

