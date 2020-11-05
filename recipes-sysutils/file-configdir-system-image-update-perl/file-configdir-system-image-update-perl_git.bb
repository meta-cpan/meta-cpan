DESCRIPTION = "System::Image::Update helps managing updates of OS images \
in embedded systems"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"HP2 Dev Team <verteiler.hp2dev.team@rademacher.com>"
HOMEPAGE=	"https://github.com/perl5-utils/File-ConfigDir-System-Image-Update"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "git://github.com/perl5-utils/File-ConfigDir-System-Image-Update.git;rev=298240c7ffd6a3ba31db5462a44269be538304f3"

RDEPENDS_${PN} += "file-configdir-perl"

S = "${WORKDIR}/git"

inherit cpan

do_configure_append() {
    oe_runmake manifest
}

BBCLASSEXTEND = "native"
