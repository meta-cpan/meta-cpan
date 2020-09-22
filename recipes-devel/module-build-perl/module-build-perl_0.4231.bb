DESCRIPTION = '"Module::Build" is a system for building, testing, and installing Perl \
modules. It is meant to be an alternative to "ExtUtils::MakeMaker". \
Developers may alter the behavior of the module through subclassing. It \
also does not require a "make" on your system - most of the "Module::Build" \
code is pure-perl and written in a very cross-platform way.'

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Build"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/Module-Build-0.4231.tar.gz"

SRC_URI[md5sum] = "066b193e461d7dfe1eca17a139353001"
SRC_URI[sha256sum] = "7e0f4c692c1740c1ac84ea14d7ea3d8bc798b2fb26c09877229e04f430b2b717"

S = "${WORKDIR}/Module-Build-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
