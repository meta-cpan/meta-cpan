DESCRIPTION = ""Module::Build\" is a system for building, testing, and installing Perl \
modules. It is meant to be an alternative to \"ExtUtils::MakeMaker\". \
Developers may alter the behavior of the module through subclassing in \
a much more straightforward way than with \"MakeMaker\". It also does not \
require a \"make\" on your system - most of the \"Module::Build\" code is \
pure-perl and written in a very cross-platform way."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Build"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/Module-Build-0.4214.tar.gz"

SRC_URI[md5sum] = "7b7ca5a47bef48c50c8b5906ca3ac7fb"
SRC_URI[sha256sum] = "c579488918cf4db84954a550c475272b3c25f5100c739339e91a65d7c055dc3f"
RDEPENDS_${PN} += "perl"

S = "${WORKDIR}/Module-Build-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
