OpenEmbedded/Yocto Project layer for CPAN modules
=================================================

This layer provides support for modules to enhance the Perl programming Language
for Open Embedded and Yocto Project build systems.

This layer requires few additions to poky maintained in

URI: https://github.com/rehsack/poky
branch: master
revision: HEAD

Contributing:
-------------

You can submit Pull Requests via GitHub.

Please refer to:
https://wiki.yoctoproject.org/wiki/Contribution_Guidelines#General_Information

for some useful guidelines to be followed when submitting patches.

Usage instructions
------------------

bblayers.conf:

At the very moment, the external tooling via Packager::Utils, rely on following:

    BBPATH = "${TOPDIR}"
    BSPDIR := "${@os.path.abspath(os.path.dirname(d.getVar('FILE', True)) + '/../..')}"
    
    BBLAYERS = "...\
    ${BSPDIR}/sources/meta-cpan \
    "

