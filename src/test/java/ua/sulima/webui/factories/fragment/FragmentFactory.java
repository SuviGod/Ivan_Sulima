package ua.sulima.webui.factories.fragment;

import ua.sulima.webui.factories.fragment.sections.BurgerMenuFragment;
import ua.sulima.webui.factories.fragment.sections.LoginFragment;
import ua.sulima.webui.factories.fragment.sections.admin.job_dropdown.job_titles.AddingJobTitleFragment;
import ua.sulima.webui.factories.fragment.sections.admin.job_dropdown.job_titles.JobTitlesFragment;
import ua.sulima.webui.factories.fragment.sections.admin.AdminManagementMenuFragment;

public interface FragmentFactory {

    AdminManagementMenuFragment getAdminManagementMenuFragment();

    AddingJobTitleFragment getAddingJobTitleFragment();

    JobTitlesFragment getJobTitlesFragment();

    LoginFragment getLoginFragment();

    BurgerMenuFragment getBurgerMenuFragment();




    void closeDriver();
}
