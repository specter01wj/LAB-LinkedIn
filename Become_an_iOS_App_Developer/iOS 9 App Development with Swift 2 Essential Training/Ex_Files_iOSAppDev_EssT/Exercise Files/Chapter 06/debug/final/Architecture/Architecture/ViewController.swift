//
//  ViewController.swift
//  Architecture
//
//  Created by LDC on 2/17/16.
//  Copyright © 2016 LDC. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        let num = countThings()
        print("\(15 / num)")
    }
    
    func countThings() -> Int {
        var num1 = 0
        let num2 = 0
        for var i = 0; i < 5; i++ {
            num1++
        }
        return num1
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

