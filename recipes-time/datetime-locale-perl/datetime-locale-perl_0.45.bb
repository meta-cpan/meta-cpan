DESCRIPTION = "DateTime::Locale is primarily a factory for the various locale \
subclasses. It also provides some functions for getting information on \
all the available \
locales."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime-Locale"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Locale-0.45.tar.gz"

SRC_URI[md5sum] = "8ba6a4b70f8fa7d987529c2e2c708862"
SRC_URI[sha256sum] = "8aa1b8db0baccc26ed88f8976a228d2cdf4f6ed4e10fc88c1501ecd8f3ccaf9c"
RDEPENDS_${PN} += "list-moreutils-perl"
RDEPENDS_${PN} += "params-validate-perl"
DEPENDS += "perl"

S = "${WORKDIR}/DateTime-Locale-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
