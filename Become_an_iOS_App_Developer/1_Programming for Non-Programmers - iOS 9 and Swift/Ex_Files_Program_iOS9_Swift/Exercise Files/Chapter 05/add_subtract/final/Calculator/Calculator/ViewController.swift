//
//  ViewController.swift
//  Calculator
//
//  Created by LDC on 10/14/15.
//  Copyright © 2015 LDC. All rights reserved.
//

import UIKit

enum modes {
    case NOT_SET
    case ADDITION
    case SUBTRACTION
}

class ViewController: UIViewController {
    
    var labelString:String = "0"
    var currentMode:modes = modes.NOT_SET
    var savedNum:Int = 0
    var lastButtonWasMode:Bool = false
    @IBOutlet weak var label: UILabel!
    
    @IBAction func tapped0(sender: AnyObject) {tappedNumber(0)}
    @IBAction func tapped1(sender: AnyObject) {tappedNumber(1)}
    @IBAction func tapped2(sender: AnyObject) {tappedNumber(2)}
    @IBAction func tapped3(sender: AnyObject) {tappedNumber(3)}
    @IBAction func tapped4(sender: AnyObject) {tappedNumber(4)}
    @IBAction func tapped5(sender: AnyObject) {tappedNumber(5)}
    @IBAction func tapped6(sender: AnyObject) {tappedNumber(6)}
    @IBAction func tapped7(sender: AnyObject) {tappedNumber(7)}
    @IBAction func tapped8(sender: AnyObject) {tappedNumber(8)}
    @IBAction func tapped9(sender: AnyObject) {tappedNumber(9)}
    
    
    @IBAction func tappedPlus(sender: AnyObject) {
        changeMode(modes.ADDITION)
    }
    
    @IBAction func tappedMinus(sender: AnyObject) {
        changeMode(modes.SUBTRACTION)
    }
    
    @IBAction func tappedEquals(sender: AnyObject) {
    }
    
    @IBAction func tappedClear(sender: AnyObject) {
        savedNum = 0
        labelString = "0"
        label.text = "0"
        currentMode = modes.NOT_SET
        lastButtonWasMode = false
    }
    
    func tappedNumber(num:Int) {
        if lastButtonWasMode {
            lastButtonWasMode = false
            labelString = "0"
        }
        labelString = labelString.stringByAppendingString("\(num)")
        updateText()
    }
    
    func updateText() {
        guard let labelInt:Int = Int(labelString) else {
            label.text = "Int conversion failed"
            return
        }
        if currentMode == modes.NOT_SET {
            savedNum = labelInt
        }
        label.text = "\(labelInt)"
    }
    
    func changeMode(newMode:modes) {
        if savedNum == 0 {
            return
        }
        currentMode = newMode
        lastButtonWasMode = true
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

