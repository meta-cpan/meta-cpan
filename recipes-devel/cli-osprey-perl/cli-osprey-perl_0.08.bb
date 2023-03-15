DESCRIPTION = "CLI::Osprey is a module to assist in writing commandline applications with \
M* OO modules (Moose, Moo, Mo). With it, you structure your app as one or \
more modules, which get instantiated with the commandline arguments as \
attributes. Arguments are parsed using Getopt::Long::Descriptive, and both \
long and short help messages as well as complete manual pages are \
automatically generated. An app can be a single command with options, or \
have sub-commands (like "git"). Sub-commands can be defined as modules \
(with options of their own) or as simple coderefs."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/CLI-Osprey"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AR/ARODLAND/CLI-Osprey-0.08.tar.gz"

SRC_URI[md5sum] = "faacf1400414bc57e551c4ce700523b1"
SRC_URI[sha256sum] = "f7480523dbdf2c2b53789c06a8bd91cf6579bb8cc5678e72ea8a1faaab30d19a"
RDEPENDS:${PN} += "getopt-long-descriptive-perl"
RDEPENDS:${PN} += "module-runtime-perl"
RDEPENDS:${PN} += "moo-perl"
RDEPENDS:${PN} += "path-tiny-perl"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "module-build-tiny-perl-native"
DEPENDS += "test-lib-perl-native"

S = "${WORKDIR}/CLI-Osprey-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
