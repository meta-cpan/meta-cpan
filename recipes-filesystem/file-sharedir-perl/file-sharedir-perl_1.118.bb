DESCRIPTION = "The intent of File::ShareDir is to provide a companion to Class::Inspector \
and File::HomeDir, modules that take a process that is well-known by \
advanced Perl developers but gets a little tricky, and make it more \
available to the larger Perl community."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-ShareDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/File-ShareDir-1.118.tar.gz"

SRC_URI[md5sum] = "0084f730f4e3d4d89703d92b3ea82f54"
SRC_URI[sha256sum] = "3bb2a20ba35df958dc0a4f2306fc05d903d8b8c4de3c8beefce17739d281c958"
RDEPENDS:${PN} += "class-inspector-perl"
RRECOMMENDS:${PN} += "list-moreutils-perl"
RRECOMMENDS:${PN} += "params-util-perl"
DEPENDS += "file-sharedir-install-perl-native"
RECOMMENDS += "inc-latest-perl-native"

S = "${WORKDIR}/File-ShareDir-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
