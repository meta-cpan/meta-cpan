DESCRIPTION = ""ExtUtils::Typemaps::Default\" is an \"ExtUtils::Typemaps\" subclass \
that provides a set of default mappings (in addition to what perl itself \
provides). These default mappings are currently defined as the combination \
of the mappings provided by the following typemap classes which are \
provided in this distribution:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-Typemaps-Default"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SM/SMUELLER/ExtUtils-Typemaps-Default-1.05.tar.gz"

SRC_URI[md5sum] = "346c127faf7b74bc4cfc29fa3e8e6f8d"
SRC_URI[sha256sum] = "3dfaf5837ebfdc007895bfca84c3c2e76d589a7d336400e8dfb3243d818215de"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/ExtUtils-Typemaps-Default-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
