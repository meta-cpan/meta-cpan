DESCRIPTION = "The intent of File::ShareDir is to provide a companion to Class::Inspector \
and File::HomeDir, modules that take a process that is well-known by \
advanced Perl developers but gets a little tricky, and make it more \
available to the larger Perl community."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-ShareDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/File-ShareDir-1.104.tar.gz"

SRC_URI[md5sum] = "e921ec8d0a373690b5da9e03a548c223"
SRC_URI[sha256sum] = "07b628efcdf902d6a32e6a8e084497e8593d125c03ad12ef5cc03c87c7841caf"
RDEPENDS_${PN} += "class-inspector-perl"
DEPENDS += "file-sharedir-install-perl-native"
RECOMMENDS += "inc-latest-perl-native"

S = "${WORKDIR}/File-ShareDir-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
