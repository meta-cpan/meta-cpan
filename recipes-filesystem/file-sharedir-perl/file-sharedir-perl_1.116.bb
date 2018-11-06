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

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/File-ShareDir-1.116.tar.gz"

SRC_URI[md5sum] = "f2a0eee9f04c93753dd56437175e5bda"
SRC_URI[sha256sum] = "59d90bfdf98c4656ff4173e62954ea8cf0de66565e35d108ecd7050596cb8328"
RDEPENDS_${PN} += "class-inspector-perl"
RRECOMMENDS_${PN} += "list-moreutils-perl"
RRECOMMENDS_${PN} += "params-util-perl"
DEPENDS += "file-sharedir-install-perl-native"
RECOMMENDS += "inc-latest-perl-native"

S = "${WORKDIR}/File-ShareDir-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
