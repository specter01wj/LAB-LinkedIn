//
//  ViewController.swift
//  UI
//
//  Created by LDC on 2/10/16.
//  Copyright © 2016 LDC. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var label: UILabel!
    @IBOutlet weak var datePicker: UIDatePicker!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    @IBAction func buttonClicked(sender: AnyObject) {
        let date:NSDate = datePicker.date
        let formatter:NSDateFormatter = NSDateFormatter()
        formatter.dateFormat = "EEEE"
        label.text = "The day is... \(formatter.stringFromDate(date))"
    }
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

