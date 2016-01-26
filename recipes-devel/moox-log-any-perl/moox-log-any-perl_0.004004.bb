DESCRIPTION = "A logging role building a very lightweight wrapper to Log::Any for use \
with your Moo or Moose classes. Connecting a Log::Any::Adapter should be \
performed prior to logging the first log message, otherwise nothing will \
happen, just like with Log::Any"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Log-Any"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CA/CAZADOR/MooX-Log-Any-0.004004.tar.gz"

SRC_URI[md5sum] = "e9f984c64e87856ceaa485c354e4f467"
SRC_URI[sha256sum] = "2a1afa0f3a411e28a9258ccabe2c5b5d647abc29f2fbf5be9ffaf2286e830534"
RDEPENDS_${PN} += "log-any-perl"
RDEPENDS_${PN} += "moo-perl"

S = "${WORKDIR}/MooX-Log-Any-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
