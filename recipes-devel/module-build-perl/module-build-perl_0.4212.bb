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

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/Module-Build-0.4212.tar.gz"

SRC_URI[md5sum] = "e5c5ecb4425bcd33574fb47a22048520"
SRC_URI[sha256sum] = "f4913b0b95065ad4666d69eed1ce93488a175eacd3b40e1e0c9c6b181f11e812"
RDEPENDS_${PN} += "perl"

S = "${WORKDIR}/Module-Build-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
