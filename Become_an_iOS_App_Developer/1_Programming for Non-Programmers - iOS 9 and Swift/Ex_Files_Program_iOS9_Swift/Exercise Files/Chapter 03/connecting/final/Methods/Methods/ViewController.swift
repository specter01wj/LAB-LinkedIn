//
//  ViewController.swift
//  Methods
//
//  Created by LDC on 10/13/15.
//  Copyright © 2015 LDC. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var label: UILabel!
    var score:Int = 0
    
    func didScore(points:Int) {
        score += points
        label.text = "Score: \(score)"
    }
    
    @IBAction func didShootAlien(sender: AnyObject) {
        didScore(1)
    }
    @IBAction func didShootShip(sender: AnyObject) {
        didScore(5)
    }
    @IBAction func didShootBigShip(sender: AnyObject) {
        didScore(10)
    }
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        self.didScore(1)
        self.didScore(5)
        self.didScore(1)
        self.didScore(10)
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

