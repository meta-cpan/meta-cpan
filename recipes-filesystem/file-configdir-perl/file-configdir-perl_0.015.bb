DESCRIPTION = "This module is a helper for installing, reading and finding \
configuration file locations. It's intended to work in every supported \
Perl5 environment and will always try to Do The Right Thing(tm)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-ConfigDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/File-ConfigDir-0.015.tar.gz"

SRC_URI[md5sum] = "9f6a530b4ed23451e8ed8b90995bdca0"
SRC_URI[sha256sum] = "abd3f974ae0093271dac902e5438a27705d09f97183a21e84c769bf0791b9425"
RRECOMMENDS_${PN} += "file-homedir-perl"
RRECOMMENDS_${PN} += "list-moreutils-perl"
DEPENDS += "extutils-makemaker-perl-native"

S = "${WORKDIR}/File-ConfigDir-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
