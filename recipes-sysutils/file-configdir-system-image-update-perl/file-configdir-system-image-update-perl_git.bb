DESCRIPTION = "System::Image::Update helps managing updates of OS images \
in embedded systems"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://github.com/perl5-utils/File-ConfigDir-System-Image-Update"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "git://github.com/perl5-utils/File-ConfigDir-System-Image-Update.git;rev=298240c7ffd6a3ba31db5462a44269be538304f3;protocol=https;nobranch=1"

RDEPENDS:${PN} += "file-configdir-perl"

S = "${WORKDIR}/git"

inherit cpan allarch

do_configure:append() {
    oe_runmake manifest
}

BBCLASSEXTEND = "native"
