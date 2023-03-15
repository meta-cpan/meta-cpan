DESCRIPTION = "USING THE AppConfig MODULE To import and use the AppConfig module the \
following line should appear in your Perl script:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/AppConfig"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEILB/AppConfig-1.71.tar.gz"

SRC_URI[md5sum] = "7747d9241561ed5567d5e134b8648707"
SRC_URI[sha256sum] = "1177027025ecb09ee64d9f9f255615c04db5e14f7536c344af632032eb887b0f"
DEPENDS += "test-pod-perl-native"

S = "${WORKDIR}/AppConfig-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
